import pandas as pd

def findHeavyAnimals(animals: pd.DataFrame) -> pd.DataFrame:
    result = animals.sort_values("weight",ascending=False)
    return result[animals["weight"]>100][["name"]]

