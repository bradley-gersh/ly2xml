grammar Lilypond;

score : SCORE_KW '{' staff? '}';
// SCORE_T '{' (staff_group | staff)? layout_block? midi_block? '}' version?; staff_group: NEW_T
// 'StaffGroup' with_block? '<<' global? voices* '>>';
staff        : NEW_KW 'Staff' with_block? '{' prefix_block? voice? '}';
with_block   : WITH_KW '{' assignment* '}';
prefix_block : line+;
line         : KW (~SLASH)*;
assignment   : NAME '=' '"' NAME '"';
voice        : NEW_KW 'Voice' '{' NOTE* '}';

// layout_block: LAYOUT_T '{' '}'
NOTE      : NOTE_CLASS OCTAVE? DURATION?;
OCTAVE    : '\''+ | ','+;
DURATION  : DIGIT+ '.'?;
SCORE_KW  : '\\score';
NEW_KW    : '\\new';
LAYOUT_KW : '\\layout';
WITH_KW   : '\\with';
KW        : SLASH LETTER+;
NAME      : LETTER+;
SLASH     : '\\';

fragment LETTER     : [a-zA-Z];
fragment NOTE_CLASS : [a-g];
fragment DIGIT      : [0-9]+;

WS  : [ \t\r\n]+ -> skip;
ALL : .+? -> skip;
