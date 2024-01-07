+ SequenceableCollection {

	morseselect {
		arg text, offset=0, all=true, oneMultiplier=1, zeroMultiplier=1, oneReplace="sequence", zeroReplace=0;
		var bin, counter, onecounter=0, zerocounter=0, returnlist=[];

		bin = text.morse2bin;
		counter = 0;

		bin.do({
			arg bit;
			if(
				bit == 1,
				{
					oneMultiplier.do({
						returnlist = returnlist.add(this[counter + offset % this.size]);
						counter = counter + 1
					})
				},
				{
					if(
						zeroReplace == "sequence",
						{
							zeroMultiplier.do({
								returnlist = returnlist.add(this[counter + offset % this.size]);
								counter = counter + 1
							})
						},
						{
							zeroMultiplier.do({
								if(
									zeroReplace.isKindOf(SequenceableCollection),
									{
										returnlist = returnlist.add(zeroReplace[zerocounter % zeroReplace.size]);
										zerocounter = zerocounter + 1;
										counter = counter + 1;
									},
									{
										returnlist = returnlist.add(zeroReplace);
										counter = counter + 1;
									}
								)
							})
						}
					)
				}
			)
		});

		^returnlist
	}

}