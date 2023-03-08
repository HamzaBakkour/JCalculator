$endPointRespond = (Invoke-WebRequest -URI "http://localhost:8765/sum?a=1&b=2" -UseBasicParsing).Content
if($endPointRespond -eq 3){
    return 1
}
else{
    return 0
}