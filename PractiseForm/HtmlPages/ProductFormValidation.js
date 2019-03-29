function isDataValid() {

	flag = false;
	var pid = document.prodForm.prodid;
	var pname = document.prodForm.prodname;
	var price = document.prodForm.p_price;
	var addr = document.prodForm.address;
	var city = document.prodForm.city;
	var email = document.prodForm.email;
	var elec = document.prodForm.pcat[0];
	var utensil = document.prodForm.pcat[1];
	var type = document.prodForm.typ;
	if (p_id_validation(pid, 3, 9)) {
		if (pnm_validation(pname, 7, 12)) {
			if (checkprice(price)) {
				if (alphanumeric(addr)) {
					if (selectcity(city)) {

						if (ValidateEmail(email)) {
							if (validCat(elec, utensil)) {
								if (validType(type)) {
									flag = true;
								}
								// alert("sucess")
							}
						}
					}

				}
			}
		}
	}
	// alert(flag)
	return flag;
}

function p_id_validation(pid, mini, mx) {
	var pid_len = pid.value.length;
	if (pid_len == 0 || pid_len < mini || pid_len >= mx) {
		alert("Product Id should not be empty / length between " + mini
				+ " to " + mx);
		pid.focus();
		return false;
	}
	return true;
}

function pnm_validation(pname, mini, mx) {
	var pnm_len = pname.value.length;
	if (pnm_len == 0 || pnm_len >= mx || pnm_len < mini) {
		alert("Name should not be empty / length be between " + mx + " to "
				+ mini);
		passid.focus();
		return false;
	}
	return true;
}

function checkprice(price) {
	var amtreg = /^[0-9]+$/;
	if (price.value.match(amtreg)) {
		return true;
	} else {
		alert('Price should not be empty and must have Digits only');
		price.focus();
		return false;
	}
}

function alphanumeric(addr) {
	var letters = /^[0-9a-zA-Z]+$/;
	if (addr.value.match(letters)) {
		return true;
	} else {
		alert('Store address must have alphanumeric characters only');
		uadd.focus();
		return false;
	}
}

function selectcity(city) {
	if (city.value == "Default") {
		alert('Select your city from the list');
		city.focus();
		return false;
	} else {
		return true;
	}
}

function allnumeric(uzip) {
	var numbers = /^[0-9]+$/;
	if (uzip.value.match(numbers)) {
		return true;
	} else {
		alert('ZIP code must have numeric characters only');
		uzip.focus();
		return false;
	}
}

function ValidateEmail(email) {
	var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	if (email.value.match(mailformat)) {
		return true;
	} else {
		alert("You have entered an invalid email address!");
		return false;
	}
}

function validCat(elec, utensil) {

	if (elec.checked == false && utensil.checked == false) {
		alert('Please Select Product category');
		elec.focus();
		return false;
	} else {
		// alert('Your Succesfully added a Product ');
		return true;
	}
}

function validType(type) {
	
	for (var i = 0; i < type.length; i++) {
		if(type[i].hasAttribute('checked'))
			return true;
	}
	alert('Please Select a type');
	return false;
}
