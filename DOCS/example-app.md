# Example app

<h2>Table of contents</h2>

- [Introduction](#introduction)
- [Where to find the app](#where-to-find-the-app)
- [What is in the app](#what-is-in-the-app)

## Introduction

The example app is used to test the DocmosisCloud module. Therefor it can be used by you to see how you can implement the module in your own app.

## Where to find the app

Download the [latest version as zip file](https://github.com/Docmosis/mendix-integration/archive/main.zip) or use git to clone it from the [GitHub repository](https://github.com/Docmosis/mendix-integration).

If you want to run the app then open it in Mendix Studio Pro and in the profile update the two DocmosisCloud module constants with your access key and end point. Or start the app and enter the access key on the home page in the appropriate field.

> ATTENTION: This example app exposes the API access key visually. So when you want to hide it then remove the field(s) from the app's home page.

## What is in the app

These modules are in the app:

- **DocmosisCloud:** That is [the module](module.md) where this is all about.
- **DocmosisSamples:** The business entities to manage customers, products and invoices and trigger the creation of PDFs.
- **DocmosisCloudImplementation:** This module implements the module in this specific app with its specific needs. Here decision are made how to create PDFs, how to handle errors, etc. This is specific to the app, operational needs, etc.
- **DocmosisCloudUnitTesting:** Implementation of unit tests for the [DocmosisCloud module](module.md), directly related to development of it.

> In case of errors or other unforeseen events the module does not log errors or show messages to the user. It is up to your app to decide what to do. Hint: Use module **DocmosisCloudImplementation** to get inspiration how you could implement this in your app so it matches your operational need.

This is what the app looks like in terms of layers. Module **DocmosisCloudUnitTesting** is not in scope.

![Module](assets/Modules.png)
