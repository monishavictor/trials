function dedup(inputStr, chunkSize) {
    // Write your code here
    let deduplicatedStr = "";
    let i = 0;
    let j = 0, len = 0;
    let chunkCount = 0, chunkLimit = 0;
    let chunk = "", dedupedChunk = "";
    while (j < inputStr.length) {
        chunkCount += 1;
        chunk = inputStr.slice(j, j+chunkSize);
        i = 0;
        dedupedChunk = "";
        while (i < chunk.length-1) {
            len = 1;
            chunkLimit = chunkCount*chunkSize;
            while(chunk[i] == chunk[i+1]) {
                i++;
                len += 1;
                if(i == chunkLimit - 1) {
                    break;
                }
            }
            if (len > 2) {
                dedupedChunk = chunk[i-1] + (len).toString();
                deduplicatedStr += dedupedChunk;
                dedupedChunk = "";
            }
            else if(len == 2) {
                deduplicatedStr += chunk[i-1] + chunk[i-1];
            }
            else {
                deduplicatedStr += chunk[i];
            }
            i += 1;
            if (i == chunk.length-1 && chunk[i] != chunk[i-1]) {
                deduplicatedStr += chunk[i];
            }
        }
        j += chunkSize;
    }
    return deduplicatedStr;
}

function redup(deduplicatedStr, chunkSize) {
    let i = deduplicatedStr.length -1, len = "";
    let originalStr = "",val = "";
    while (i >= 0) {
        val = deduplicatedStr[i];
        if(val >= "0" && val <= "9") {
            while(deduplicatedStr[i] >= "0" && deduplicatedStr[i] <= "9") {
                len = deduplicatedStr[i] + len;
                i-=1;
            }
        }
        else {
            if (len) {
                originalStr = val.repeat(parseInt(len)) + originalStr;
                len = "";
                val = "";
            }
            else {
                originalStr = val + originalStr;
            }
            i-=1;
        }
    }
    return originalStr;
}