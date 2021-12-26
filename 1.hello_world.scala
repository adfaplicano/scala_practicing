// Creating a class named hello_world
class hello_world {
    println("Hello World")
}
new hello_world()


// Creating a class with parameters
class hello_world_parameter(message: String) {
    println(message)
}
new hello_world_parameter("Hello World!")


// Creating a function named hello_world
def hello_world() = {
    println("helloooooo")
}
hello_world()

// Creating a function with parameters
def hello_world_function_parameter(message: String) = {
    println(message)
}
hello_world_function_parameter("Testing function Hello World!")

// Creating a function with default parameters
def hello_world_default_parameters(firstname: String = " ", lastname: String = " ") = {
    println(firstname + " " + lastname)
}
hello_world_default_parameters("Alex")