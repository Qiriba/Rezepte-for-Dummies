from flask import Flask, jsonify, send_from_directory


app = Flask(__name__)

@app.route('/api/hello', methods=['GET'])
def hello():
    return jsonify({'message': 'Hello, World!'})

IMAGE_FOLDER = 'images'
app.config['IMAGE_FOLDER'] = IMAGE_FOLDER

# Route to serve images
@app.route('/api/images/<filename>', methods=['GET'])
def get_image(filename):
    return send_from_directory(app.config['IMAGE_FOLDER'], filename)

if __name__ == '__main__':
    app.run(debug=True)