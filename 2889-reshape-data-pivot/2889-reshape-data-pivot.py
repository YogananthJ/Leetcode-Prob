import pandas as pd

def pivotTable(weather: pd.DataFrame) -> pd.DataFrame:
    return pd.pivot_table(weather,values="temperature",columns=["city"],index=["month"])