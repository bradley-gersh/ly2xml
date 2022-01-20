grammar Lilypond;

// Multi-line blocks
score_file: (
        header_block
        | book_block
        | score_block
        | version_cmd
    )+;
book_block   : BOOK_KW LBRACE score_block RBRACE;
header_block : HEADER_KW LBRACE assignment* RBRACE;
score_block  : SCORE_KW LBRACE staff_block* RBRACE;
staff_block:
    STAFF_CTX with_block? LBRACE prefix_block? voice_block RBRACE;
staffgroup_block : STAFFGROUP_CTX '<<' staff_block* '>>';
prefix_block     : time_cmd;
with_block       : WITH_KW LBRACE assignment* RBRACE;
voice_block:
    VOICE_CTX LBRACE (note_block | polyphony_block)* RBRACE;
note_block     : ( relative_block | note_cmd | NOTE)+;
relative_block : RELATIVE_KW NOTE LBRACE note_block RBRACE;
polyphony_block:
    '<<' LBRACE note_block RBRACE '\\\\' LBRACE note_block RBRACE '>>';

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
key_cmd     : KEY_KW NOTE MODE;
mark_cmd    : MARK_KW (SCM_TOKEN | DEFAULT_KW)?;
tempo_cmd   : TEMPO_KW (STRING? TEMPO_EQN | STRING);
time_cmd    : TIME_KW TIME_SIG;
version_cmd : VERSION_KW VERSION_STR;
assignment  : ID '=' STRING;

// Contexts
STAFF_CTX      : '\\new Staff';
STAFFGROUP_CTX : '\\new StaffGroup';
VOICE_CTX      : '\\new Voice';

// Layout Commands
BOOK_KW    : '\\book';
HEADER_KW  : '\\header';
LAYOUT_KW  : '\\layout';
SCORE_KW   : '\\score';
WITH_KW    : '\\with';
VERSION_KW : '\\version';

// Notation Commands
BAR_KW      : '\\bar';
CLEF_KW     : '\\clef';
DEFAULT_KW  : '\\default';
FERMATA_KW  : '\\fermata';
ITALIC_KW   : '\\italic';
KEY_KW      : '\\key';
MARK_KW     : '\\mark';
MARKUP_KW   : '\\markup';
MODE_KW     : MODE_MAJ | MODE_MIN;
MODE_MAJ    : '\\major';
MODE_MIN    : '\\minor';
RELATIVE_KW : '\\relative';
TEMPO_KW    : '\\tempo';
TIME_KW     : '\\time';

KW : SLASH ID_CHAR+;

// Note entry
NOTE      : ID_CHAR OCTAVE? DURATION?;
TIME_SIG  : INTEGER '/' INTEGER;
TEMPO_EQN : INTEGER '=' INTEGER;
DURATION  : INTEGER '.'?;
OCTAVE    : '\''+ | ','+;
BARLINE   : '"' BAR_CHAR+ '"';

ID                   : (ID_CHAR | '.' | '/')+;
STRING               : '"' STRING_CHAR+ '"';
VERSION_STR          : '"' (INTEGER | '.')+ '"';
SCM_TOKEN            : '#' .+? WS;
LBRACE               : '{';
RBRACE               : '}';
SLASH                : '\\';
INTEGER              : DIGIT+;
fragment STRING_CHAR : [a-zA-Z ];
fragment ID_CHAR     : [a-zA-Z];
fragment DIGIT       : [0-9];
fragment BAR_CHAR    : [|.;![\]];

COMMENT_MULTILINE : '%{' .*? '%}';
COMMENT_INLINE    : '%' .*? WS;
WS                : [ \t\r\n]+ -> skip;
ALL               : .+? -> skip;
