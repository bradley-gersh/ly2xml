import sys

import antlr4 as antlr

from LilypondLexer import LilypondLexer
from LilypondParser import LilypondParser

def main(argv):
    source = antlr.FileStream(argv[1])
    lexer = LilypondLexer(source)
    tokens = antlr.CommonTokenStream(lexer)
    parser = LilypondParser(tokens)
    tree = parser.score_file()

if __name__ == '__main__':
    main(sys.argv)
