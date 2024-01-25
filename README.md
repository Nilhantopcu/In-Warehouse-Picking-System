# Warehouse Order Picking Optimization

This project aims to enhance the efficiency of order picking operations in a warehouse management system. Specifically, it investigates the impact of order picking activities on the travel costs, a significant component of order fulfillment. 

## Table of Contents

1. [Project Description](#project-description)
2. [Algorithms](#algorithms)
   - [S-Shape Picking System Algorithm](#s-shape-picking-system-algorithm)
   - [Midpoint Picking System Algorithm](#midpoint-picking-system-algorithm)
   - [Return Picking System Algorithm](#return-picking-system-algorithm)
3. [Data Set](#data-set)
   - [List.txt](#listtxt)
4. [Usage](#usage)
5. [Contribution](#contribution)
6. [License](#license)

## Project Description

After providing a brief overview of warehouse management and systems, this project delves into the analysis of order-picking methods to reduce travel distances. In particular, back-to-back rack systems with cross-aisles have been considered. S-Shape, Return, and Mid-Point heuristics have been evaluated within the scope of this study. The paper also proposes the best routing algorithm for the minimization of picker travel distance in a specific manual warehouse.

## Algorithms

### S-Shape Picking System Algorithm

The S-Shape algorithm, implemented in Java, is an optimized method for order picking in a specific warehouse. For details, please refer to [SShapeAlgorithm.java](SShapeAlgorithm.java).

### Midpoint Picking System Algorithm

The Midpoint algorithm, implemented in Java, aims to reduce travel distance by targeting the midpoint during order picking. For details, please refer to [MidpointAlgorithm.java](MidpointAlgorithm.java).

### Return Picking System Algorithm

The Return algorithm, implemented in Java, aims to minimize travel distance by incorporating returns to a specific point during picking. For details, please refer to [ReturnAlgorithm.java](ReturnAlgorithm.java).

## Data Set

### List.txt

The [list.txt](list.txt) file contains sample picking lists for various scenarios. Each line represents the location of a product.

Example content:

```plaintext
6 500
6 505
6 508
...
7 507
7 506
```

Here, the first column represents the corridor number, and the second column represents the sequence of the product in the corridor.

## Usage
Find instructions on how to use the project in this section. For example:
```bash
javac SShapeAlgorithm.java
java SShapeAlgorithm list.txt
```