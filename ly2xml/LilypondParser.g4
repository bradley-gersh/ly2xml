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
    )+ END_NOTEBLOCK;
prefix_block : (time_cmd? key_cmd) | time_cmd;
voice_block:
    (VOICE_CTX | VOICE_CTX_N | VOICE_CTX_P) (
        note_block
        | polyphony_block
    )* END_NOTEBLOCK;
note_block:
    (
        relative_block
        | note_cmd
        | polyphony_block
        | chord
        | note
        | voice_block
    )+;
relative_block : REL_BLOCK_N note_block END_NOTEBLOCK;
polyphony_block:
    (START_POLYPHONY_N voice_block+ END_POLYPHONY_P)
    | (
        START_POLYPHONY_N NEW_NOTEBLOCK_P note_block END_NOTEBLOCK (
            NEXT_NOTEBLOCK_P NEW_NOTEBLOCK_P note_block END_NOTEBLOCK
        )* END_POLYPHONY_P
    );
chord : LANGLE note+ RANGLE (INTEGER | INTEGER DOT)?;
note  : NOTE;

// One-line commands
note_cmd:
    bar_cmd
    | clef_cmd
    | fermata_cmd
    | key_cmd
    | mark_cmd
    | tempo_cmd
    | time_cmd
    | voice_cmd;
bar_cmd     : BAR_KW BARLINE;
clef_cmd    : CLEF_KW ID;
fermata_cmd : FERMATA_KW;
key_cmd     : KEY_KW NOTE MODE_KW;
mark_cmd    : MARK_KW (scheme_cmd | DEFAULT_KW)?;
scheme_cmd  : SCHEME_GP | SCHEME_ATOM;
tempo_cmd   : TEMPO_KW STRING (INTEGER EQUALS INTEGER)?;
time_cmd    : TIME_KW TIME_SIG;
version_cmd : VERSION_KW VERSION_STR;
voice_cmd   : VOICE_ONE | VOICE_TWO | VOICE_THREE | VOICE_FOUR;
assignment  : ID EQUALS (STRING | scheme_cmd);
