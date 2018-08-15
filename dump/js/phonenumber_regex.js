
/*
 * Complete the function below.
 */
function find_phone_number(text) {
    if (text.indexOf('-') == -1) {
        return "NONE";
    }
    matchStrArray = text.match(/(\([0-9]{3}\))[\s][\0-9]{3}[\-][0-9]{4}/);
    if (matchStrArray && matchStrArray.length > 0) {
        return matchStrArray[0];    
    }
    else {
        matchStrArray = text.match(/([0-9]{3})[\-][\0-9]{3}[\-][0-9]{4}/);
        if (matchStrArray && matchStrArray.length > 0) {
            return matchStrArray[0];    
        }
    }
    return "NONE";
    
}
