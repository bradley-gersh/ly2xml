import sys

import antlr4 as antlr

from ly2xml import LilypondLexer, LilypondParser, LilypondErrorListener, LilypondDataclasses, LilypondAST

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
        print("Parse tree successfully generated.")
    except SyntaxError as e:
        print("Parsing error encountered while attempting to parse Lilypond file:")
        print(e)

    # Produce the Lilypond AST
    try:
        lyAst = tree.toLyAst()
        print("Lilypond AST generated from parse tree.")
    except Exception as e:
        print("Error while attempting to convert parse tree to Lilypond AST:")
        print(e)

    # Convert to a MusicXML AST

    # Produce MusicXML file from MusicXML AST

    # `tree` is the unedited parse tree. For documentation on the fields and
    # methods available on this tree and its nodes, see the documentation for
    # ANTLR 4 (linked in README.md).

    # `lyAst` is the cleaned-up AST from the Lilypond format.

if __name__ == '__main__':
    main(sys.argv)
