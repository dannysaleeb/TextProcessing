Morse {
	classvar <morsedict;

	*initClass {
		morsedict = {
			|dict|
			dict = Dictionary.new();
			dict.putPairs([
				\a, [\dit,\dah],
				\b, [\dah,\dit,\dit,\dit],
				\c, [\dah,\dit,\dah,\dit],
				\d, [\dah,\dit,\dit],
				\e, [\dit],
				\f, [\dit,\dit,\dah,\dit],
				\g, [\dah,\dah,\dit],
				\h, [\dit,\dit,\dit,\dit],
				\i, [\dit,\dit],
				\j, [\dit,\dah,\dah,\dah],
				\k, [\dah,\dit,\dah],
				\l, [\dit,\dah,\dit,\dit],
				\m, [\dah,\dah],
				\n, [\dah,\dit],
				\o, [\dah,\dah,\dah],
				\p, [\dit,\dah,\dah,\dit],
				\q, [\dah,\dah,\dit,\dah],
				\r, [\dit,\dah,\dit],
				\s, [\dit,\dit,\dit],
				\t, [\dah],
				\u, [\dit,\dit,\dah],
				\v, [\dit,\dit,\dit,\dah],
				\w, [\dit,\dah,\dah],
				\x, [\dah,\dit,\dit,\dah],
				\y, [\dah,\dit,\dah,\dah],
				\z, [\dah,\dah,\dit,\dit]
			])
		}.value;
	}

	getmorsedict {
		^morsedict;
	}
}