function whoWillWinIpl(names){

    lengthOfNames=names.length;
    var randomPosition=Math.floor(Math.random()*lengthOfNames);
    console.log(names[randomPosition]+" Will win ipl.");

}

whoWillWinIpl(["MI","GT","RCB","CSK","LSG","PBKS","RR","KKR","SRH"]);