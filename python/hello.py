# # data -> information -> knowledge -> window
# ''' on the basis of type of data:-
#      1. Structured data = meaningful names to rows
#      2. Semi Structured
#      3. Unstructured
     
#      quantitative data
#      1. Discrete
#      2. Continous
     
#      qualitative/ categorized
#      1. Normal 
#      2. Ordinal
#      Assignment -- Create a conda environment that uses python 3.8, das,default matplotlib,default plotly and default scikit-learn version. The name of the environment will be analysis_env. ALso install Jupyter lab default version inside the environment.
# ''' 
import json
import csv

with open('5MB.json') as f:
    data = json.load(f)

with open('5MB.csv', 'w', newline='') as f:
    writer = csv.writer(f)
    writer.writerow(data[0].keys())
    for row in data:
        writer.writerow(row.values())
print("complete")