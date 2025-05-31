function fetchDaata(url, callback){
    console.log(`Fetching data from ${url}`);
    // Simulating an asynchronous operation using setTimeout
    setTimeout(() => {
        const data = `response from ${url}`;
        callback(data);
    }, 2000);
}
fetchDaata("http://www.flipkart.com",function(data)
{
    console.log("Data received: " + data);
});