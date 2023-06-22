# Youtube-Video-Summarizing-App
This repository contains the source code for an Android app that summarizes YouTube videos using BART and mT5 models. The app uses Hugging Face's cloud to host the summarization models, which are accessed through an API. The app includes a search activity and a summary activity where users can search for a video and view a summarized version of it.

# Project Overview
YouTube videos can be long and time-consuming to watch, especially if the user is only interested in a specific topic or segment. This Android app aims to help users save time by summarizing YouTube videos using BART and mT5 models.

The app uses Hugging Face's cloud to host the summarization models, which are accessed through the following API endpoint: https://huggingface.co/spaces/BilalSardar/yt-video-summarizer. The user can search for a video in the search activity and select it to view a summary in the summary activity. The summary includes the most important parts of the video, allowing the user to get the gist of the content without watching the entire video.

# Getting Started
To use this app, you will need to have Android Studio installed on your computer. You can download Android Studio from the official website: https://developer.android.com/studio

Once you have Android Studio installed, you can clone this repository and open the project in Android Studio. From there, you can build and run the app on an Android device or emulator.

You will also need to set up an account on Hugging Face's cloud and deploy the summarization models as an API. The app is currently set up to connect to a specific API endpoint, so you will need to update the endpoint URL in the code to match your own deployment.

# Contributing
Contributions to this project are welcome! If you find a bug or have a suggestion for a new feature, please open an issue on the GitHub repository.

If you would like to contribute code, please fork the repository and submit a pull request with your changes. Please make sure to follow the project's coding style and guidelines.
