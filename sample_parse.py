import sys

import antlr4 as antlr

from lypy import LilypondLexer, LilypondParser, LilypondErrorListener

def main(argv):
    # Parse the file passed in from a command line argument
    source = antlr.FileStream(argv[1])
    lexer = LilypondLexer(source)
    tokens = antlr.CommonTokenStream(lexer)
    parser = LilypondParser(tokens)

    # Improve error handling
    parser.removeErrorListeners()
    parser.addErrorListener(LilypondErrorListener())
    lexer.removeErrorListeners()
    lexer.addErrorListener(LilypondErrorListener())

    # Produce the concrete parse tree
    try:
        tree = parser.score_file()
        print("Parse tree successfully generated and stored in a variable for use.")
    except SyntaxError as e:
        print("Parsing error encountered while attempting to parse Lilypond file:")
        print(e)

    # `tree` is the unedited parse tree. For documentation on the fields and
    # methods available on this tree and its nodes, see the documentation for
    # ANTLR 4 (linked in README.md).

if __name__ == '__main__':
    main(sys.argv)
