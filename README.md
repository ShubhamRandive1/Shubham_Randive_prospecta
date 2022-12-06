# Shubham_Randive_prospecta
prospecta repo for the round 1 get methods with one post method to save

1)while creating the API I have implemented the class not found exception,classNotFoundException will ensure if there is no class found with the given path variable i.e description or title then it will throw exception prompting the message “Class Not Found”
2)while creating proper endpoint should be considered
These are the following endpoints

```@GetMapping("/api.publicapis.org/entries/getAllEntries")

@PostMapping("/api.publicapis.org/entries/saveTheClassModel")

@GetMapping("/api.publicapis.org/entries/getDetailsByCategory")

@GetMapping("/api.publicapis.org/entries/getTitleById")```


1) I will import csvWriter.jar as a library in order to operate. Using delimiter (“,”) separated data
2) Then by using the file will get the csv file from the local storage 
3)After implementing the mathematical logic.
4) will write the csv file in same or new location

Answer 
1:the challenge will be null pointer exception then arithematic error
2:the formula might be using with wrong logic or might not work with edge cases

Answer: 1)User might pass null values
2) user might not follow the order to write the values
3)user might enter the non valid values and get the exceptions

