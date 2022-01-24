lexer grammar LilypondLexer;

// ---- Default mode: Lilypond commands ----

// Contexts
STAFFGROUP_CTX : '\\new StaffGroup';
STAFF_CTX      : '\\new Staff' WS? LBRACE -> pushMode(NOTE_ENTRY);
VOICE_CTX      : '\\new Voice' WS? LBRACE -> pushMode(NOTE_ENTRY);

// Layout Commands
HEADER_KW   : '\\header';
LAYOUT_KW   : '\\layout';
SCORE_KW    : '\\score';
WITH_KW     : '\\with';
VERSION_KW  : '\\version';
SCHEME_GP   : HASH '(' .*? ')';
SCHEME_ATOM : HASH ~[(] .*? WS;

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

fragment STRING_CHAR : [a-zA-Z .,];
fragment ID_CHAR     : [a-zA-Z];

// Bypassed characters (default mode)
COMMENT_MULTILINE : '%{' .*? '%}' -> skip;
COMMENT_INLINE    : '%' .*? WS -> skip;
WS                : [ \t\r\n]+ -> skip;

// ---- Note-entry mode: For entering pitches ----
mode NOTE_ENTRY;

// Exiting note-entry mode
END_NOTE : RBRACE_N -> popMode;

// Nested Voice contexts are allowed
VOICE_CTX_N:
    '\\new Voice' WS? LBRACE_N -> pushMode(NOTE_ENTRY);

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
fragment BAR_CHAR   : [|.;![\]];

// Special characters (note-entry mode)
HASH_N    : '#' -> type(HASH);
LBRACE_N  : {System.out.println("lbracen");} '{' -> type(LBRACE);
RBRACE_N  : '}' -> type(RBRACE);
LANGLE_N  : {System.out.println("langlen");} '<' -> type(LANGLE);
RANGLE_N  : '>' -> type(RANGLE);
EQUALS_N  : '=' -> type(EQUALS);
DOT_N     : '.' -> type(DOT);
BSLASH_N  : '\\' -> type(BSLASH);
FSLASH_N  : '/' -> type(FSLASH);
INTEGER_N : [0-9]+ -> type(INTEGER);
STRING_N  : '"' STRING_CHAR+ '"' -> type(STRING);

// Bypassed characters (note-entry mode)
COMMENT_MULTILINE_N : '%{' .*? '%}' -> skip;
COMMENT_INLINE_N    : '%' .*? WS -> skip;
WS_N                : [ \t\r\n]+ -> skip;

// ---- Polyphony mode: For creating side-by-side note blocks ----
mode POLYPHONY;

// Mode transitions
NEXT_NOTEBLOCK_P : FSLASH_P FSLASH_P;
NEW_NOTEBLOCK_P  : LBRACE_P -> pushMode(NOTE_ENTRY);
END_POLYPHONY_P  : RANGLE_P RANGLE_P -> popMode;

// Special characters (polyphony mode)
HASH_P    : '#' -> type(HASH);
LBRACE_P  : {System.out.println("lbracen");} '{' -> type(LBRACE);
RBRACE_P  : '}' -> type(RBRACE);
LANGLE_P  : {System.out.println("langlen");} '<' -> type(LANGLE);
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
