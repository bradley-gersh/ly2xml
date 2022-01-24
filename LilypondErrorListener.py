import re
import antlr4 as antlr

from antlr4.error.ErrorListener import ErrorListener

from LilypondParser import LilypondParser

class LilypondErrorListener(ErrorListener):

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        error = f'Syntax error at [{line}, {column}]'

        if offendingSymbol is not None:
            error += (f', symbol "{offendingSymbol.text}"')

        if e is not None:
            error += (f' ({type(e).__name__})')

        error += f': {msg}'

        raise(SyntaxError(error))
