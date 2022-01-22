#
# This Makefile assumes that antlr4 is available on your system,
# though you may need to configure the path for ANTLR4 yourself.
#
# If this is not the case for you, see the ANTLR4 installation
# instructions at https://www.antlr.org/.
#
ANTLR4 = java -jar ~/Code/lib/java/antlr-4.9.3-complete.jar

#
# Rebuild the parser in Python3 (default) after edits to the
# grammar file Lilypond.g4
#
python:
	$(ANTLR4) -Dlanguage=Python3 -no-listener -no-visitor Lilypond.g4

#
# Rebuild the parser in Java after edits to the grammar file
# Lilypond.g4. Requires `javac`.
#
java:
	$(ANTLR4) -Dlanguage=Java -no-listener -no-visitor Lilypond.g4
	javac Lilypond*.java

#
# Remove the files built by ANTLR4.
#
clean:
	rm -f *.interp
	rm -f *.tokens
	rm -f LilypondParser*.*
	rm -f LilypondLexer*.*
	rm -rf .antlr/
