+ String {

	morse2dur {

		arg dit_dur_on=1, dit_dur_off=dit_dur_on;
		var text, morse=Morse.morsedict, returnlist;

		// convert to symbols
		text = this.toLower.asList.collect({ arg letter; letter.asSymbol });

		returnlist = text.collect({
			arg char_symbol;
			morse[char_symbol].collect({
				arg morse_symbol, count;
				if(
					morse_symbol == \dit,
					{
						if(
							count == (morse[char_symbol].size - 1),
							{ [dit_dur_on, Rest(dit_dur_off * 3)] },
							{ [dit_dur_on, Rest(dit_dur_off)] }
						);
					},
					{
						if(
							count == (morse[char_symbol].size - 1),
							{ [dit_dur_on * 3, Rest(dit_dur_off * 3)] },
							{ [dit_dur_on * 3, Rest(dit_dur_off)] }
						);
					}
				);
			});
		});
		returnlist = returnlist.add(Rest(dit_dur_off * 4));
		^returnlist.flatten.flatten
	}

}

