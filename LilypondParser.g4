parser grammar LilypondParser;

options {
    tokenVocab = LilypondLexer;
}

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
    STAFF_CTX prefix_block? (
        note_block
        | polyphony_block
        | voice_block
    )+ RBRACE;
prefix_block : (time_cmd? key_cmd) | time_cmd;
voice_block  : VOICE_CTX (note_block | polyphony_block)* END_NOTE;
note_block: (
        relative_block
        | note_cmd
        | polyphony_block
        | chord
        | NOTE
    )+;
relative_block : RELATIVE_KW NOTE LBRACE note_block END_NOTE;
polyphony_block:
    POLYPHONY_N note_block END_NOTE NEXT_POLYPHONY_N note_block END_NOTE END_POLYPHONY_N;
chord : LANGLE NOTE+ RANGLE (INTEGER | INTEGER DOT)?;

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
tempo_cmd   : TEMPO_KW STRING (INTEGER EQUALS INTEGER)?;
time_cmd    : TIME_KW TIME_SIG;
version_cmd : VERSION_KW VERSION_STR;
assignment  : ID EQUALS (STRING | scheme_cmd);
