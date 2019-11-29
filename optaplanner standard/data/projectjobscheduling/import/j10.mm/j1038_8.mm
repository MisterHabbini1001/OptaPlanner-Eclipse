************************************************************************
file with basedata            : mm38_.bas
initial value random generator: 895935411
************************************************************************
projects                      :  1
jobs (incl. supersource/sink ):  12
horizon                       :  79
RESOURCES
  - renewable                 :  2   R
  - nonrenewable              :  2   N
  - doubly constrained        :  0   D
************************************************************************
PROJECT INFORMATION:
pronr.  #jobs rel.date duedate tardcost  MPM-Time
    1     10      0       18        8       18
************************************************************************
PRECEDENCE RELATIONS:
jobnr.    #modes  #successors   successors
   1        1          3           2   3   4
   2        3          2           5   6
   3        3          2           5   8
   4        3          1           5
   5        3          2           9  10
   6        3          1           7
   7        3          1           8
   8        3          3           9  10  11
   9        3          1          12
  10        3          1          12
  11        3          1          12
  12        1          0        
************************************************************************
REQUESTS/DURATIONS:
jobnr. mode duration  R 1  R 2  N 1  N 2
------------------------------------------------------------------------
  1      1     0       0    0    0    0
  2      1     2       8    4    6    6
         2     6       6    4    6    5
         3     9       5    3    5    2
  3      1     1       4    7    7    9
         2     8       4    5    7    5
         3     9       1    4    6    3
  4      1     3       8    3    6    5
         2     5       8    2    6    5
         3     7       7    2    5    2
  5      1     2       6    9    6    6
         2     4       4    6    6    4
         3     6       4    1    5    4
  6      1     4       7    8    9    8
         2     9       6    4    6    7
         3    10       5    3    4    6
  7      1     3       2    6    9    5
         2     5       2    5    9    5
         3     8       1    3    8    5
  8      1     6      10    7    7    9
         2     8       4    6    5    9
         3    10       3    6    5    8
  9      1     3       6    5    7    2
         2     4       5    5    6    1
         3     7       5    4    5    1
 10      1     2       9    6    4    3
         2     6       6    3    4    2
         3     6       4    5    3    2
 11      1     1       7    7    6    9
         2     5       5    6    5    8
         3     7       2    6    3    7
 12      1     0       0    0    0    0
************************************************************************
RESOURCEAVAILABILITIES:
  R 1  R 2  N 1  N 2
   10    8   58   51
************************************************************************
