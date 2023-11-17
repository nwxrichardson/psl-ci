# PSL Sirius Editor

Eclipse Sirius editor for a simple [Project Scheduling Language (PSL)](psl/psl.emf). The editor demonstrates:

- Nodes, containers and element/relationsip-based edges
- Using multiple diagrams in the same model
- Custom icons and colours
- Layers

## How to run

- Clone this repository
- Install [Epsilon 2.4 using the Eclipse Installer](https://eclipse.dev/epsilon/download)
  - Prefer an embedded JRE 11/17
- Using the `Help -> Install New Software` menu in Eclipse, install the following features from the `https://download.eclipse.org/releases/2021-12` update site
  - Sirius Properties Views - Runtime Support
  - Sirius Properties Views - Specifier Support
  - Sirius Specifier Environment
- Import the following projects from this repository in your workspace
  - `psl`
  - `psl.edit`
  - `psl.editor`
  - `psl.tests`
- Right-click on the `psl` project and select `Run As -> Eclipse Application`
- In the new Eclipse instance, import the following projects from this repository
  - `psl.design`
  - `psl.example`
- Switch to the `Modeling` perspective
- Explore the diagrams within `acme.psl`

## Screenshots

![](screenshots/tasks-diagram.png)

![](screenshots/effort-diagram.png)

![](screenshots/deliverables-diagram.png)

## Resources

The editor's [custom icons](psl.edit/icons/full/obj16) were borrowed from the [archi](https://github.com/archimatetool/archi/tree/master/com.archimatetool.editor/img) tool.
