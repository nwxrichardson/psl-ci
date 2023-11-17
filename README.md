# PSL Sirius Editor

Eclipse Sirius editor for a simple Project Scheduling Language (PSL). The editor demonstrates:

- Using multiple diagrams in the same model
- Using custom icons and colours

## How to run

- Clone this repository
- Install Epsilon 2.4 using the Eclipse Installer

  - Prefer an embedded JRE 11/17
- Using the `Help -> Install New Software` menu in Eclipse, install the following features from the `https://download.eclipse.org/releases/2021-12` update site
  - Sirius Properties Views - Runtime Support
  - Sirius Properties Views - Specifier Support
  - Sirius Specifier Environment
- Import the following projects from the repository in your workspace
  - psl
  - psl.edit
  - psl.editor
  - psl.tests
- Right-click on the `psl` project and select `Run As -> Eclipse Application`
- In the new Eclipse instance, import the following projects
  - psl.design
  - psl.example
- Switch to the `Modeling` perspective
- Explore the diagrams within `acme.model`

## Screenshots

![](screenshots/tasks-diagram.png)

![](screenshots/effort-diagram.png)

![](screenshots/deliverables-diagram.png)