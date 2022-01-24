lexer grammar LilypondLexer;

// ---- Default mode: Lilypond commands ----

// Contexts
STAFFGROUP_CTX : '\\new StaffGroup';
STAFF_CTX      : '\\new Staff' WS? LBRACE -> pushMode(NOTEBLOCK);
VOICE_CTX      : '\\new Voice' WS? LBRACE -> pushMode(NOTEBLOCK);

// Layout Commands
HEADER_KW   : '\\header';
LAYOUT_KW   : '\\layout';
SCORE_KW    : '\\score';
WITH_KW     : '\\with';
VERSION_KW  : '\\version';
SCHEME_GP   : HASH '(' .*? ')';
SCHEME_ATOM : HASH ~[(] STRING_CHAR+;

// Special characters (default mode)
ID          : (ID_CHAR | '.')+;
STRING      : '"' STRING_CHAR+ '"';
VERSION_STR : '"' (INTEGER | '.')+ '"';
HASH        : '#';
LBRACE      : '{';
RBRACE      : '}';
LANGLE      : '<';
RANGLE      : '>';
EQUALS      : '=';
DOT         : '.';
BSLASH      : '\\';
FSLASH      : '/';
INTEGER     : [0-9]+;

fragment STRING_CHAR : [a-zA-Z .,-];
fragment ID_CHAR     : [a-zA-Z];

// Bypassed characters (default mode)
COMMENT_MULTILINE : '%{' .*? '%}' -> skip;
COMMENT_INLINE    : '%' .*? WS -> skip;
WS                : [ \t\r\n]+ -> skip;

// ---- Noteblock mode: For entering pitches ----
mode NOTEBLOCK;

// Mode transitions
END_NOTEBLOCK : RBRACE_N -> popMode;
VOICE_CTX_N   : '\\new Voice' WS? LBRACE -> pushMode(NOTEBLOCK);
REL_BLOCK_N:
    RELATIVE_KW WS? NOTE LBRACE -> pushMode(NOTEBLOCK);
START_POLYPHONY_N : LANGLE_N LANGLE_N -> pushMode(POLYPHONY);

// Notes
NOTE     : PITCH ACCIDENTAL* OCTAVE? (INTEGER_N | INTEGER_N '.')?;
OCTAVE   : '\''+ | ','+;
TIME_SIG : INTEGER_N '/' INTEGER_N;
BARLINE  : '"' BAR_CHAR+ '"';

// Other notation commands
BAR_KW      : '\\bar';
CLEF_KW     : '\\clef';
DEFAULT_KW  : '\\default';
FERMATA_KW  : '\\fermata';
KEY_KW      : '\\key';
MARK_KW     : '\\mark';
MODE_KW     : MODE_MAJ | MODE_MIN;
MODE_MAJ    : '\\major';
MODE_MIN    : '\\minor';
RELATIVE_KW : '\\relative';
TEMPO_KW    : '\\tempo';
TIME_KW     : '\\time';

fragment PITCH      : [a-gr];
fragment ACCIDENTAL : 's' | 'is' | 'es';
fragment BAR_CHAR   : [|.:;![\]];

// Special characters (noteblock mode)
HASH_N    : '#' -> type(HASH);
LBRACE_N  : '{' -> type(LBRACE);
RBRACE_N  : '}' -> type(RBRACE);
LANGLE_N  : '<' -> type(LANGLE);
RANGLE_N  : '>' -> type(RANGLE);
EQUALS_N  : '=' -> type(EQUALS);
DOT_N     : '.' -> type(DOT);
BSLASH_N  : '\\' -> type(BSLASH);
FSLASH_N  : '/' -> type(FSLASH);
INTEGER_N : [0-9]+ -> type(INTEGER);
ID_N      : (ID_CHAR | '.')+ -> type(ID);
STRING_N  : '"' STRING_CHAR+ '"' -> type(STRING);

// Bypassed characters (noteblock mode)
COMMENT_MULTILINE_N : '%{' .*? '%}' -> skip;
COMMENT_INLINE_N    : '%' .*? WS -> skip;
WS_N                : [ \t\r\n]+ -> skip;

// ---- Polyphony mode: For creating side-by-side note blocks ----
mode POLYPHONY;

// Mode transitions
NEXT_NOTEBLOCK_P : BSLASH_P BSLASH_P;
NEW_NOTEBLOCK_P  : LBRACE_P -> pushMode(NOTEBLOCK);
VOICE_CTX_P      : '\\new Voice' WS? LBRACE_P -> pushMode(NOTEBLOCK);
END_POLYPHONY_P  : RANGLE_P RANGLE_P -> popMode;

// Special characters (polyphony mode)
HASH_P    : '#' -> type(HASH);
LBRACE_P  : '{' -> type(LBRACE);
RBRACE_P  : '}' -> type(RBRACE);
LANGLE_P  : '<' -> type(LANGLE);
RANGLE_P  : '>' -> type(RANGLE);
EQUALS_P  : '=' -> type(EQUALS);
DOT_P     : '.' -> type(DOT);
BSLASH_P  : '\\' -> type(BSLASH);
FSLASH_P  : '/' -> type(FSLASH);
INTEGER_P : [0-9]+ -> type(INTEGER);
STRING_P  : '"' STRING_CHAR+ '"' -> type(STRING);

// Bypassed characters (polyphony mode)
COMMENT_MULTILINE_P : '%{' .*? '%}' -> skip;
COMMENT_INLINE_P    : '%' .*? WS -> skip;
WS_P                : [ \t\r\n]+ -> skip;
