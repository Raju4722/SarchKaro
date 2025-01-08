
alert("ghj")



function abcd() { 
	const name1 = document.getElementById('prona').value;
		const avail = document.getElementById('avai').value;
		const gen = document.getElementById('gen').value;
	const abc = {
	
		"prodName": name1,
		"availability": avail,
		"gender": gen
	};

fetch('http://localhost:8080/products', {
	method: 'POST',
	headers: {
		'Content-Type': 'application/json'  // Indicating that we are sending JSON
	},
	body: JSON.stringify(abc)  // Convert the object to a JSON string
})
	.then(response => response.json())  // Parse the JSON response
	.then(data => {
		console.log('Success:', data);
	})
	.catch(error => {
		console.error('Error:', error);
	});
}

/*function abcddele() { 
	const name1 = document.getElementById('prona').value;
		
	

fetch('http://localhost:8080/products/${name1}') {
	method: 'DELETE'})
	 // Parse the JSON response
	.then(data => {
		console.log('Success:', data);
	})
	.catch(error => {
		console.error('Error:', error);
	});
}*/
function abcddele() {
	const name1=document.getElementById('prona').value;
    // Construct the URL with the path variable
         url='http://localhost:8080/products/{name2}'

		    fetch('http://localhost:8080/products/'+name1, {
		        method: 'DELETE', // HTTP method is DELETE
		        headers: {
		            'Content-Type': 'application/json' // Set content type for JSON requests
		        }
		    })
		    .then(response => {
		        if (response.ok) {
		            return response.text(); // or response.json() if the server returns JSON
		        } else {
		            throw new Error('Failed to delete the item');
		        }
		    })
		    .then(data => {
		        console.log(data); // Log the server response (like success message)
		    })
		    .catch(error => {
		        console.error('Error:', error);
		    });
		}