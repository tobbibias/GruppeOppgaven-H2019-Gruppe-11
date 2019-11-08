set up JavaFx i intelij to run MainjavaFX view.
Download JavaFx: https: https://gluonhq.com/products/javafx/?fbclid=IwAR3ovp0QUZPP1j9RZkeP76aiFLfKWMEG_axxl_IIxa_ivY5aUAJQgZFsvTI
Choose 'JavaFX Windows SDK'.
Place where-ever, but a common location would be C:/programfiles/java/javafx
Go to File -> Settings -> Appearance & Behavior -> Path Variables. Add new path named: PATH_TO_FX and set location to C:/Program files/java/javafx/lib
Go to File -> Settings -> Appearance & Behavior -> Path Variables. Add new path named: PATH_TO_FX and set location to C:/Program files/java/javafx/lib
If MainFX is already in Configurations, proceed to step 6.
Go to Edit Configuration... and press the + sign top left. Name: MainFX, Main class: TicketService.MainFX.
 Add : --module-path ${PATH_TO_FX} --add-modules=javafx.controls,javafx.fxml    to "Edit Configurations... -> VM Options."
