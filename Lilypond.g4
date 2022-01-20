grammar Lilypond;

score        : KW LBRACE staff? RBRACE;
staff        : KW OBJ_TYPE with_block? LBRACE line+ RBRACE;
with_block   : KW LBRACE assignment* RBRACE;
prefix_block : line+;
line         : KW (~SLASH)*;
assignment   : NAME '=' STRING;
// voice        : KW 'Voice' LBRACE NOTE* RBRACE;

STRING   : '"' LETTER+ '"';
OBJ_TYPE : ('Score' | 'Staff' | 'Voice');
NOTE     : LETTER OCTAVE? DURATION?;
OCTAVE   : '\''+ | ','+;
DURATION : DIGIT+ '.'?;
KW       : SLASH LETTER+;
NAME     : LETTER+;

LBRACE : '{';
RBRACE : '}';
SLASH  : '\\';

fragment LETTER : [a-zA-Z];
// fragment NOTE_CLASS : [a-g];
fragment DIGIT : [0-9]+;

WS  : [ \t\r\n]+ -> skip;
ALL : .+? -> skip;

// ---- Discarded rules SCORE_T '{' (staff_group | staff)? layout_block? midi_block? '}' version?;
// staff_group: NEW_T 'StaffGroup' with_block? '<<' global? voices* '>>'; layout_block: LAYOUT_T
// LBRACE RBRACE SCORE_KW : '\\score'; NEW_KW : '\\new'; LAYOUT_KW : '\\layout'; WITH_KW : '\\with';
