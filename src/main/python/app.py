import requests


def GenerateSummary(link):
    response = requests.post("https://bilalsardar-yt-video-summarizer.hf.space/run/predict", json={
      "data": [
        link,
        "BART",
    ]}).json()

    data = response["data"]
    return data[0]