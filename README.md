
# News Channel Android Application

This project is an Android application that simulates a news channel with animated content and a moving news ticker at the bottom of the screen. The application showcases various Android development skills, including UI design, animation, and handling multiple layers in a single activity.

## Features

- [x] **Hashtag Display:** Shows a TextView with your first name and last name in PascalCase with a hashtag at the top left corner.
- [x] **Channel Logo:** Displays a channel logo at the top right corner.
- [x] **News Ticker:** A red rectangular bar at the bottom with white text scrolling horizontally, simulating a live news ticker.
- [x] **Background Animation:**
  - [x] An airplane that moves from left to right, shrinking in size to create a depth effect.
  - [x] A dolphin that jumps out of the water every 6 seconds, rotating in a circle.
  - [x] A static sea at the bottom of the screen where the dolphin jumps in and out.

## Demo

Check out the demo video below to see the application in action:

<img src="/demo.gif" alt="App Demo" height="400">

## User Interface Design

### Layout

- **Hashtag:** Positioned at the top left corner, ensuring it does not touch the screen edges.
- **Channel Logo:** Positioned at the top right corner, keeping a distance from the screen edges.
- **News Ticker:** A continuous scrolling text at the bottom of the screen with a contrasting color to ensure readability.
- **Background:** Contains animated elements such as a plane, a dolphin, and a sea with a static sky image.

### Animation Details

1. **Hashtag:**
   - Visible for 5 seconds, fades out over 2 seconds, stays invisible for 5 seconds, and fades back in over 2 seconds.
   - This cycle repeats continuously.

2. **Channel Logo:**
   - Continuously scales along the x-axis to create a rotating effect.

3. **News Ticker:**
   - Scrolls text to the left continuously across the bottom of the screen.

4. **Background:**
   - The airplane moves from left to right while shrinking.
   - The dolphin jumps out of the water every 6 seconds, rotates, and returns to the sea.


## Technical Specifications

- **Device:** Pixel 3a XL
- **API Level:** 26 (Minimum SDK)
- **Tools Used:** Android Studio, PNG images for objects

