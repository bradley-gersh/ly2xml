lexer grammar LilypondLexer;

// Contexts
STAFF_CTX      : '\\new Staff';
STAFFGROUP_CTX : '\\new StaffGroup';
VOICE_CTX      : '\\new Voice';

// Layout Commands
HEADER_KW   : '\\header';
LAYOUT_KW   : '\\layout';
SCORE_KW    : '\\score';
WITH_KW     : '\\with';
VERSION_KW  : '\\version';
SCHEME_GP   : HASH '(' .*? ')';
SCHEME_ATOM : HASH ~[(] .*? WS;

// Notation Commands
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

KW : SLASH ID_CHAR+;

// Note entry
NOTE     : ID_CHAR OCTAVE? (INTEGER | INTEGER '.')?;
TIME_SIG : INTEGER '/' INTEGER;
OCTAVE   : '\''+ | ','+;
BARLINE  : '"' BAR_CHAR+ '"';

ID                   : (ID_CHAR | '.' | '/')+;
STRING               : '"' STRING_CHAR+ '"';
VERSION_STR          : '"' (INTEGER | '.')+ '"';
HASH                 : '#';
LBRACE               : '{';
RBRACE               : '}';
LANGLE               : '<';
RANGLE               : '>';
EQUALS               : '=';
DOT                  : '.';
SLASH                : '\\';
INTEGER              : DIGIT+;
fragment STRING_CHAR : [a-zA-Z .,];
fragment ID_CHAR     : [a-zA-Z];
fragment DIGIT       : [0-9];
fragment BAR_CHAR    : [|.;![\]];

COMMENT_MULTILINE : '%{' .*? '%}' -> skip;
COMMENT_INLINE    : '%' .*? WS -> skip;
WS                : [ \t\r\n]+ -> skip;
ALL               : .+? -> skip;
