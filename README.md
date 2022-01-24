# ly2musicxml

This is a small transpiler that converts [Lilypond](https://lilypond.org)
notation into the [MusicXML](https://www.musicxml.com/for-developers/) format.

## Usage

At the command line, enter

```sh
python ly2musicxml.py /path/to/FILE.ly
```

where `FILE.ly` is your Lilypond source to convert to MusicXML. A sample file,
`sample.ly`, is included in the repository as a demonstration.

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

Note that only three contexts are supported, and `\with` blocks are
not yet parsed.

- Notation commands

  ```lilypond
  \bar, \clef, \default, \key, \mark, \major, \minor, \relative, \tempo, \time
  ```

  Chords (delimited by `< >`) are also possible. At present, rhythms cannot
  involve tuplets, and repeat signs are not supported. The parser can recognize
  polyphony blocks (delimited by `<< >>`), but currently only the top line is
  transpiled into MusicXML.

## Credits

This implementation was developed by Bradley Gersh and released under the MIT
License. Development is ongoing, but if you have suggestions or bug reports,
please feel free to let me know!

The parser was generated using Terence Parr and Sam Harwell's
[ANTLR4](https://www.antlr.org/). My model for the AST code is based on
[Strumenta's](https://strumenta.com/) course,
["Using ANTLR Like a Professional," Professional Edition](https://tomassetti.me/antlr-course-2-edition/).
