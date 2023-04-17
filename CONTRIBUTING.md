# Contributing to ROSNetworkTablesBridge

Thank you for your interest in contributing to ROSNetworkTablesBridge! We appreciate the time and effort you're willing to put into improving this project. This document will provide you with guidelines to help make the contribution process as smooth as possible.

# How to Contribute

1. **Fork the repository**: To contribute to this project, start by creating a fork of the repository. Click the "Fork" button in the top-right corner of the repository page to create your own copy.

2. **Clone your fork**: Clone your fork to your local machine using the following command:

  ```bash
  git clone <https://github.com/your_username/ROSNetworkTablesBridge.git>
  ```

3. **Create a new branch**: Create a new branch to work on your feature or bug fix. This helps keep your changes separate from the main project and makes it easier to merge your changes later.

  ```bash
  git checkout -b my-feature-branch
  ```

4. **Make your changes**: Implement the feature or bugfix, following the project's code style and best practices.

5. **Commit your changes**: Commit your changes to the branch, using a descriptive commit message.

  ```bash
  git add . 
  git commit -m "Implement feature XYZ"
  ```

6. **Pull the latest changes**: Before creating a pull request, make sure your branch is up-to-date with the main branch by pulling the latest changes.

  ```bash
  git fetch upstream
  git checkout main 
  git pull 
  git checkout my-feature-branch 
  git merge main
  ```

  If there are any conflicts, resolve them and commit the changes.

7. **Push your changes**: Push your branch to your forked repository.

  ```bash
  git push origin my-feature-branch
  ```

8. **Create a pull request**: Go to your forked repository on GitHub and create a new pull request. Fill out the pull request template with a detailed description of your changes, referencing any related issues.

9. **Wait for a review**: The project maintainers will review your pull request and provide feedback. Be prepared to make changes if necessary. Once your changes are approved, your pull request will be merged into the main branch.

# Reporting Bugs or Requesting Features

If you find a bug or have a suggestion for a new feature, please create an issue in the issue tracker. Before creating a new issue, check if it already exists to avoid duplicates.

When reporting a bug, provide as much information as possible, including steps to reproduce the issue, any error messages, and your environment (e.g., operating system, Java version, and ROS distribution).

When requesting a new feature, describe the feature in detail, explain why it would be useful, and provide any relevant examples or use cases.

# Community

If you have any questions or need help, feel free to join our community chat or forum (if applicable). We're always happy to help and discuss ideas.

Once again, thank you for considering contributing to ROSNetworkTablesBridge! Your contributions help make this project better for everyone.
