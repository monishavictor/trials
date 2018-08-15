function getChildren(key, element) {
  if (key == 'attributes') {
    if (element.class && element.class.split(" ").includes('baz')) {
      outputArray = outputArray.concat(element.id)  
    }
  }
  if (key == 'childNodes') {
    for (i = 0; i < element.length; i++) {
      for (var attributename in element[i]) {
        getChildren(attributename, element[i][attributename]);
      }
    }    
  }
}


function mainMethod() {
  input = '{"className":"baz","tree":{"tagName":"div","attributes":{"id":"0","class":"foo bar baz"},"childNodes":[{"tagName":"span","attributes":{"id":"1","class":"baz"},"childNodes":[]},{"tagName":"p","attributes":{"id":"2","class":"baz"},"childNodes":[{"tagName":"span","attributes":{"id":"3","class":"ba1"},"childNodes":[]}]}]}}'
  input = '{"className":"baz","tree":{"tagName":"div","attributes":{"id":"0","class":"foo bar baz"},"childNodes":[{"tagName":"span","attributes":{"id":"1","class":"baz"},"childNodes":[]},{"tagName":"p","attributes":{"id":"2","class":"baz"},"childNodes":[{"tagName":"span","attributes":{"id":"3","class":"baz"},"childNodes":[]}]}]}}'
  outputArray = [];
  tree = JSON.parse(input).tree

  for(var attributename in tree){
    getChildren(attributename, tree[attributename])
  }
  console.log(outputArray)
}

mainMethod();


