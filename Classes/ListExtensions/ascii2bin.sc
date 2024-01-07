+ String {

	ascii2bin {
		var return = [];
		this.do({
			arg char;
			return = return.add(char.ascii.asBinaryDigits);
		});
		^return.flatten
	}

}

