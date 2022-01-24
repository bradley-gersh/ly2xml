# LyParse

This is a small Python 3 parser for a subset of [Lilypond](https://lilypond.org), a DSL
for music notation.

## Usage

The PyPI package [antlr4-python3-runtime](https://pypi.org/project/antlr4-python3-runtime/)
is required. If necessary, first install it from the command line:

```sh
pip install antlr4-python3-runtime
```

At present, the parser yields an (unedited) parse tree that can be used in a
Python script. The file `sample_parse.py`, which generates the parse tree in
memory for further manipulation, demonstrates how it can be created in context.
To apply this sample script to a Lilypond file, enter from the command line:

```sh
python sample_parse.py path/to/file.ly
```

replacing `path/to/file.ly` by the appropriate path your Lilypond file. The
sample script prints a success or failure message indicating if the file has
been parsed. Note that any reported syntax errors will refer to the names of
internally defined tokens, which might be slightly cryptic (e.g. `STAFF_CTX`)

A sample Lilypond file, `sample_score.ly`, is also included in the repository,
along with a PDF of the associated music notation.

## Supported Commands

As yet, not all Lilypond syntax is supported. Those .ly files which only use
the following commands should parse correctly:

- Organizational commands

  ```lilypond
  \header, \layout, \score, \version
  \new [Staff, StaffGroup, Voice]
  #(...) % Scheme commands
  % Comments
  %{ Multiline comments %}
  ```

Note that `\with` blocks are not yet parsed for contexts.

- Notation commands

  ```lilypond
  \bar, \clef, \default, \key, \mark, \major, \minor, \relative, \tempo, \time
  ```

  Notes with accidentals and non-tuplet rhythms are possible, as are chords
  delimited by `< >`. The parser can recognize polyphony blocks (delimited by `<< >>`)
  using either Voice contexts (`\new Voice`) or the bracket-and-backslash notation.

  For details of Lilypond syntax, see its [documentation](https://lilypond.org/doc/v2.21/Documentation/notation/index),
  especially the command index in [Appendix D](https://lilypond.org/doc/v2.21/Documentation/notation/lilypond-command-index).

## Modifying the Grammar

A small Makefile is included if you make any modifications to the grammar files
`*.g4`. If you update the grammar, execute `make python` from the shell to
regenerate the associated Python files for use in other scripts.

A `make java` command is also included in case you wish to use ANTLR's debug
tool `grun`, which requires Java classes.

The `make clean` command will clear all Java classes from the directory.

## Credits

This implementation was developed by Bradley Gersh and released under the MIT
License. Development is ongoing, but if you have suggestions or bug reports,
please feel free to let me know!

The parser was generated using Terence Parr and Sam Harwell's
[ANTLR4](https://www.antlr.org/). My model for the Python code is based on
[Strumenta's](https://strumenta.com/) course,
["Using ANTLR Like a Professional," Professional Edition](https://tomassetti.me/antlr-course-2-edition/).
