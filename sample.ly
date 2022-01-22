%{
Title: Duet
Composer: composer name
Instr.: vn + vc
%}

\header{
	title = "Duet"
	subtitle = "for violin and cello"
	composer = "composer name"
	tagline = ##f
}

#(set-global-staff-size 23) %{ default == 18 %}
#(ly:set-option 'point-and-click #f)

\score{

\new StaffGroup

	<<

	%{ Violin %}
	\new Staff {
		\clef treble

		\tempo "Mesto" 4 = 100
		\relative c''{
		\key c \minor
		\time 3/4 c4 c c\fermata
		\tempo "Allegretto"
		r b b b b b b2.\fermata
		\tempo "Tempo II"
    f'4 f f f f f f f r\fermata
		\tempo "Tempo I"
		r4
		<<
			{ g g g g g g \tempo "poco string." f f f f f } \\
			    {e e e e e e d d d d d }
		>>
		\tempo "Tempo I"
		d2. d c c\fermata \bar "||"
		}

	}

	%{ Tuba %}
	\new Staff {
		\clef bass

		\relative c{
		\time 3/4 c4 c c\fermata
		\tempo "Allegretto"
		r b b b b\mark \default b b2.\fermata
		\tempo "Tempo II"
    f'4 f f f f a, f f r\fermata
		\tempo "Tempo I"
		r4
		<<
			{ g g <g e> g g g \tempo "poco string." f f f f f } \\
			    {e e e e e <e b> d d d d d }
		>>
		\tempo "Tempo I"
		d2. d c c\fermata \bar "||"
		}
  }
	>>
}
\version "2.10.0"  % necessary for upgrading to future LilyPond versions.
