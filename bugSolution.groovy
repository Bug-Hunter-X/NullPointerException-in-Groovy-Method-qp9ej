```groovy
def myMethod(a, b) {
  return (a ?: 0) > (b ?: 0) ? a : b
}

println myMethod(5, 2) // Output: 5
println myMethod(2, 5) // Output: 5
println myMethod(null, 5) // Output: 5
println myMethod(5, null) // Output: 5
println myMethod(null, null) // Output: 0
```