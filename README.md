# JsonProProducts

A premium Android application that showcases products using the [DummyJSON API](https://dummyjson.com/). Built with modern Android technologies and Clean Architecture.

## 🚀 Features

- **Product Listing**: Browse a wide range of products with high-quality images.
- **Search**: Quickly find products by title.
- **Category Filtering**: Filter products by category using intuitive chips.
- **Product Details**: Detailed view for each product including images, pricing, and ratings.
- **Modern UI/UX**: Premium design with smooth animations and responsive layouts.
- **Clean Architecture**: Organized into data, domain, and presentation layers for maintainability.

## 🛠 Tech Stack

- **UI**: Jetpack Compose
- **Concurrency**: Kotlin Coroutines & Flow
- **Dependency Injection**: Hilt
- **Network**: Retrofit & OKHttp
- **Image Loading**: Coil
- **JSON Parsing**: GSON
- **Architecture**: MVVM + Clean Architecture

## 📦 Getting Started

1. Clone the repository.
2. Open in Android Studio (Ladybug or newer).
3. Run the `app` module on an emulator or physical device.

## 🏗 Project Structure

```text
├── app/
│   ├── src/main/java/prasad/vennam/jsonpro/
│   │   ├── data/           # API and Repository implementations
│   │   ├── domain/         # Business logic and UseCases
│   │   ├── presentation/   # ViewModels and UI Screens
│   │   ├── ui/             # Theme and Navigation
```

## 📄 License

This project is open-source and available under the MIT License.
