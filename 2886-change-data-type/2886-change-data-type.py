import pandas as pd

def changeDatatype(students: pd.DataFrame) -> pd.DataFrame:
    print("Before ",students.dtypes)
    students["grade"]=students["grade"].astype(int)
    return students