#
# This Makefile assumes that antlr4 is available on your system,
# though you may need to configure the path for ANTLR4 yourself.
#
# If this is not the case for you, see the ANTLR4 installation
# instructions at https://www.antlr.org/.
#
ANTLR4 := java -jar ~/Code/lib/java/antlr-4.9.3-complete.jar
SRC := lypy
LEXER := $(SRC)/LilypondLexer.g4
PARSER := $(SRC)/LilypondParser.g4

#
# Rebuild the parser in Python3 (default) after edits to the
# grammar file Lilypond.g4
#
python:
	$(ANTLR4) -Dlanguage=Python3 -no-listener -no-visitor $(LEXER) $(PARSER)

#
# Rebuild the parser in Java after edits to the grammar file
# Lilypond.g4. Requires `javac`.
#
java:
	$(ANTLR4) -Dlanguage=Java -no-listener -no-visitor $(LEXER) $(PARSER)
	javac lypy/Lilypond*.java

#
# Remove the files built by ANTLR4.
#
clean:
	$(RM) $(SRC)/*.interp
	$(RM) $(SRC)/*.tokens
	$(RM) $(SRC)/*.java
	$(RM) $(SRC)/*.class
	$(RM) -r $(SRC)/\.antlr/
