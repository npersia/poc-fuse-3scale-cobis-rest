# POC Fuse Hipotecario - Cobis Rest

Interfaz rest para el _backend_ Cobis.

## Descripcion

El proyecto integra la base de datos mysql Cobis exponiendo una interfaz REST

## Instalar

Para compilar generando imagen docker:

```
$ mvn clean install --settings settings.xml docker:build
```

## Instalar en openshift

Primero hay que subir el template:

```
$ oc project <nombre proyecto>
$ oc create -n `oc project -q` -f ./cobis-rest-template.json
```

Despues se puede crear mediante la interfaz web o con el comando `oc new-app ...`

**Nota:** Recordar que esto depende del [modelo](http://gitlab.semperti.local/hipotecario/poc-3scale-model) este debe estar desplegado en _openshift_ para que no falle la compilación y [Semperti Karaf Blueprint]()
