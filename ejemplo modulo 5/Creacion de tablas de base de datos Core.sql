-- Crear tabla usuarios
CREATE TABLE usuarios (
    id SERIAL PRIMARY KEY,
    correo VARCHAR(255) NOT NULL,
    created_at TIMESTAMP NOT NULL,
    nick VARCHAR(255) NOT NULL,
    nombre VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    peso NUMERIC,
    updated_at TIMESTAMP
);

-- Crear tabla direcciones
CREATE TABLE direcciones (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    numeracion VARCHAR(255) NOT NULL,
    usuario_id INT NOT NULL,
    CONSTRAINT fk_usuario
        FOREIGN KEY(usuario_id)
            REFERENCES usuarios(id)
);

-- Crear tabla roles_usuarios
CREATE TABLE roles_usuarios (
    usuario_id INT NOT NULL,
    rol_id INT NOT NULL,
    CONSTRAINT fk_usuario_rol
        FOREIGN KEY(usuario_id)
            REFERENCES usuarios(id),
    PRIMARY KEY(usuario_id, rol_id)
);
INSERT INTO usuarios (correo, created_at, nick, nombre, password, peso, updated_at)
VALUES ('nuevo@usuario.com', '2024-07-24 14:00:00', 'nuevoNick', 'Nuevo Usuario', 'nuevaPassword', 65.5, '2024-07-24 14:00:00');

INSERT INTO direcciones (nombre, numeracion, usuario_id)
VALUES ('Avenida Nueva', '456', 1);

INSERT INTO roles_usuarios (usuario_id,rol_id)
VALUES (1,1);

select * from usuarios
select * from direcciones
select * from roles_usuarios
