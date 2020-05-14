process.stdin.setEncoding('utf8');

let z = "";
process.stdin.on('data', function(chunk){
	z += chunk;
	process.stdout.write('chunk:' + chunk.toString());
});

process.stdin.on('end', function(){
	while (z--){
		console.log('hi');
	}
	process.stdout.write('end');
});
