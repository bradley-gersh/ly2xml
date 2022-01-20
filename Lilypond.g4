grammar Lilypond;

score_file  : score_block;
score_block : SCORE_KW LBRACE staff* RBRACE;
staff:
    STAFF_CTX with_block? LBRACE prefix_block? voice_block RBRACE;
prefix_block : time_cmd;
with_block   : WITH_KW LBRACE assignment* RBRACE;
voice_block  : VOICE_CTX LBRACE note_block* RBRACE;
note_block   : ( time_cmd | NOTE)+;
time_cmd     : TIME_KW TIME_SIG;
assignment   : ID '=' STRING;

// Contexts
STAFF_CTX : '\\new Staff';
VOICE_CTX : '\\new Voice';

// Commands
LAYOUT_KW : '\\layout';
SCORE_KW  : '\\score';
TIME_KW   : '\\time';
WITH_KW   : '\\with';
KW        : SLASH LETTER+;

TIME_SIG  : INTEGER '/' INTEGER;
STRING    : '"' LETTER+ '"';
NOTE      : LETTER OCTAVE? DURATION?;
OCTAVE    : '\''+ | ','+;
DURATION  : INTEGER '.'?;
ID        : (LETTER | '.' | '/')+;
SCM_TOKEN : '#' .+? WS;

LBRACE          : '{';
RBRACE          : '}';
SLASH           : '\\';
INTEGER         : DIGIT+;
fragment LETTER : [a-zA-Z];
fragment DIGIT  : [0-9];

WS  : [ \t\r\n]+ -> skip;
ALL : .+? -> skip;
