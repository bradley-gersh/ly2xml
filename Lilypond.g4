grammar Lilypond;

// Multi-line blocks
score_file: (
        header_block
        | score_block
        | version_cmd
        | scheme_cmd
    )+;
header_block : HEADER_KW LBRACE assignment* RBRACE;
score_block:
    SCORE_KW LBRACE (staff_block | staffgroup_block)* RBRACE;
staffgroup_block:
    STAFFGROUP_CTX LANGLE LANGLE staff_block* RANGLE RANGLE;
staff_block:
    STAFF_CTX with_block? LBRACE prefix_block? (
        note_block
        | polyphony_block
        | voice_block
    )+ RBRACE;
prefix_block : (time_cmd? key_cmd) | time_cmd;
with_block   : WITH_KW LBRACE assignment* RBRACE;
voice_block:
    VOICE_CTX LBRACE (note_block | polyphony_block)* RBRACE;
note_block: (
        relative_block
        | note_cmd
        | polyphony_block
        | chord
        | NOTE
    )+;
relative_block : RELATIVE_KW NOTE LBRACE note_block RBRACE;
polyphony_block:
    LANGLE LANGLE LBRACE note_block RBRACE '\\\\' LBRACE note_block RBRACE RANGLE RANGLE;
chord : LANGLE NOTE+ RANGLE (INTEGER | INTEGER '.')?;

// One-line commands
note_cmd:
    bar_cmd
    | clef_cmd
    | fermata_cmd
    | key_cmd
    | mark_cmd
    | tempo_cmd
    | time_cmd;
bar_cmd     : BAR_KW BARLINE;
clef_cmd    : CLEF_KW ID;
fermata_cmd : FERMATA_KW;
key_cmd     : KEY_KW NOTE MODE_KW;
mark_cmd    : MARK_KW (scheme_cmd | DEFAULT_KW)?;
scheme_cmd  : SCHEME_GP | SCHEME_ATOM;
tempo_cmd   : TEMPO_KW STRING (INTEGER '=' INTEGER)?;
time_cmd    : TIME_KW TIME_SIG;
version_cmd : VERSION_KW VERSION_STR;
assignment  : ID '=' (STRING | scheme_cmd);

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
