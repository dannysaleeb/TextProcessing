+ String {

	morse2bin {

		var morse=Morse.morsedict, word, returnlist;

		// convert to symbols
		word = this.toLower.asList.collect({ arg letter; letter.asSymbol });

		returnlist = word.collect({
			arg name_symbol;
			if(
				name_symbol == ' ',
				{ [0, 0, 0, 0] },
				{
					morse[name_symbol].collect({
						arg morse_symbol, count;
						if(
							morse_symbol == \dit,
							{
								if(
									count == (morse[name_symbol].size - 1),
									{ [1, 0, 0, 0] },
									{ [1, 0] }
								);
							},
							{
								if(
									count == (morse[name_symbol].size - 1),
									{ [1, 1, 1, 0, 0, 0] },
									{ [1, 1, 1, 0] }
								);
							}
						);
					});
				}
			)
		});
		returnlist = returnlist.add([0, 0, 0, 0]);
		^returnlist.flatten.flatten
	}

}

