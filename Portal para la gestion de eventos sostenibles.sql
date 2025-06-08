drop database ProyectoFP1DAW2025;
create database ProyectoFP1DAW2025;
use ProyectoFP1DAW2025;


create table usuarios (
id_usuarios int auto_increment primary key,
nombre varchar(200),
correo_electronico varchar(200),
contraseña varchar(200)
);

create table organizadores (
id_organizador int,
nombre_organizador varchar(200),
telefono_organizador varchar(200),
correo_organizador varchar(200)
);

create table categoria (
id_categoria int auto_increment primary key,
nombre_categoria varchar(200)
);

create table ubicaciones (
id_ubicacion int auto_increment primary key,
ubicacion_evento varchar(200),
tipo_ubicacion varchar(200),
direccion_ubicacion varchar(200),
enlace_ubicacion varchar(200)
);

create table eventos (
id_eventos int auto_increment primary key,
id_categoria int,
id_ubicacion int,
nombre_eventos varchar(200),	
duracion_evento double,
fecha_evento date,
FOREIGN KEY (id_ubicacion) REFERENCES ubicaciones (id_ubicacion),
FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria)
);

CREATE TABLE inscripciones (
id_usuarios int,
id_eventos int,
FECHA_INSCRIPCION DATE,
ESTADO_INSCRIPCION ENUM ('ACTIVA', 'CANCELADA') DEFAULT ('ACTIVA'), 
FOREIGN KEY (id_usuarios) REFERENCES usuarios (id_usuarios),
FOREIGN KEY (id_eventos) REFERENCES eventos(id_eventos)
);

INSERT INTO usuarios (id_usuarios,nombre, correo_electronico, contraseña) VALUES
(1,'Carlos López', 'carlos@gmail.com', 'pass123'),
(2,'Ana Martínez', 'ana@gmail.com', 'ana456'),
(3,'Pedro Gómez', 'pedro@gmail.com', 'pgomez789'),
(4,'Lucía Fernández', 'lucia@gmail.com', 'lfernandez321'),
(5,'Miguel Torres', 'miguel@gmail.com', 'mtorres987'),
(6,'Sara Rodríguez', 'sara@gmail.com', 'sara654'),
(7,'David Jiménez', 'david@gmail.com', 'djimenez321'),
(8,'María Ruiz', 'maria@gmail.com', 'mruiz852'),
(9,'Javier Navarro', 'javier@gmail.com', 'jnavarro963'),
(10,'Elena Gutiérrez', 'elena@gmail.com', 'egutierrez741');

INSERT INTO organizadores (id_organizador, nombre_organizador, telefono_organizador, correo_organizador) VALUES
(1, 'Alejandro Gómez', '611223344', 'alejandro.gomez@example.com'),
(2, 'María Rodríguez', '622334455', 'maria.rodriguez@example.com'),
(3, 'Carlos Fernández', '633445566', 'carlos.fernandez@example.com'),
(4, 'Laura Martínez', '644556677', 'laura.martinez@example.com'),
(5, 'Javier Pérez', '655667788', 'javier.perez@example.com'),
(6, 'Sofía Torres', '666778899', 'sofia.torres@example.com'),
(7, 'Ricardo López', '677889900', 'ricardo.lopez@example.com'),
(8, 'Elena Sánchez', '688990011', 'elena.sanchez@example.com'),
(9, 'Daniel Castillo', '699001122', 'daniel.castillo@example.com'),
(10, 'Patricia Ramírez', '700112233', 'patricia.ramirez@example.com');


INSERT INTO categoria (id_categoria,nombre_categoria) VALUES
(1,'Reciclaje y Sostenibilidad'),
(2,'Energías Renovables'),
(3,'Agricultura Ecológica'),
(4,'Movilidad Sostenible'),
(5,'Turismo Responsable'),
(6,'Economía Circular'),
(7,'Conservación del Medio Ambiente'),
(8,'Innovación Verde'),
(9,'Educación Ambiental'),
(10,'Reducción de Huella de Carbono');

INSERT INTO ubicaciones (id_ubicacion,ubicacion_evento, tipo_ubicacion, direccion_ubicacion, enlace_ubicacion) VALUES
(1,'Parque Central', 'Exterior', 'Av. Verde 123, Madrid', 'https://mapa.com/ubicacion1'),
(2,'Centro Eco-Educativo', 'Interior', 'Calle Solar 456, Barcelona', 'https://mapa.com/ubicacion2'),
(3,'Auditorio Verde', 'Interior', 'Plaza Energía 789, Valencia', 'https://mapa.com/ubicacion3'),
(4,'Campus Sustentable', 'Exterior', 'Calle Bosque 101, Sevilla', 'https://mapa.com/ubicacion4'),
(5,'Salón EcoFest', 'Interior', 'Paseo Azul 112, Bilbao', 'https://mapa.com/ubicacion5'),
(6,'Zona EcoMarket', 'Exterior', 'Camino Verde 223, Málaga', 'https://mapa.com/ubicacion6'),
(7,'Centro Ambiental', 'Interior', 'Av. Tierra 334, Zaragoza', 'https://mapa.com/ubicacion7'),
(8,'Foro Sostenible', 'Interior', 'Calle Oceano 445, Granada', 'https://mapa.com/ubicacion8'),
(9,'Reserva Natural', 'Exterior', 'Ruta Solar 556, Valladolid', 'https://mapa.com/ubicacion9'),
(10,'EcoHub', 'Interior', 'Calle Árbol 667, Murcia', 'https://mapa.com/ubicacion10');

INSERT INTO eventos (id_eventos, nombre_eventos, duracion_evento, fecha_evento) VALUES
(1,'Jornada de Reciclaje', 3.5, '2025-06-15'),
(2,'Foro sobre Energías Renovables', 4.0, '2025-07-10'),
(3,'Feria de Agricultura Ecológica', 5.0, '2025-08-20'),
(4,'Simposio de Movilidad Sostenible', 3.0, '2025-09-05'),
(5,'Encuentro de Turismo Responsable', 4.5, '2025-10-12'),
(6,'Congreso de Economía Circular', 6.0, '2025-11-25'),
(7,'Taller de Conservación Ambiental', 2.0, '2025-12-03'),
(8,'Hackathon de Innovación Verde', 8.0, '2026-01-15'),
(9,'Seminario de Educación Ambiental', 3.0, '2026-02-28'),
(10,'Conferencia sobre Huella de Carbono', 5.5, '2026-03-10');

INSERT INTO inscripciones (FECHA_INSCRIPCION, ESTADO_INSCRIPCION) VALUES
('2025-06-01', 'ACTIVA'),
('2025-06-05', 'ACTIVA'),
('2025-06-10', 'CANCELADA'),
('2025-07-01', 'ACTIVA'),
('2025-07-10', 'ACTIVA'),
('2025-07-20', 'ACTIVA'),
('2025-08-05', 'CANCELADA'),
('2025-08-15', 'ACTIVA'),
('2025-08-25', 'ACTIVA'),
('2025-09-01', 'ACTIVA');


