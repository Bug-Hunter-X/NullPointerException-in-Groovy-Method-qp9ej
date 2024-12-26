# Groovy NullPointerException Bug
This repository demonstrates a common error in Groovy: a NullPointerException arising from improper null handling in a method.
The `myMethod` function compares two numbers and returns the larger one. However, it fails when one of the inputs is null.
The solution showcases how to use Groovy's safe navigation operator and the Elvis operator to gracefully handle null values, avoiding the exception.